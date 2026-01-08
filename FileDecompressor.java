import java.io.*;
import java.nio.file.*;
import java.util.*;

@SuppressWarnings("unchecked")
public class FileDecompressor {

    public static void decompress(String inputFile, String outputFile) throws Exception {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(inputFile))) {

            Map<Byte, Integer> freqMap = (Map<Byte, Integer>) ois.readObject();

            HuffmanNode root = HuffmanTree.buildTree(freqMap);

            BitInputStream bis = new BitInputStream(ois);

            ByteArrayOutputStream output = new ByteArrayOutputStream();
            HuffmanNode current = root;

            int bit;
            while ((bit = bis.readBit()) != -1) {
                current = (bit == 0) ? current.left : current.right;

                if (current.left == null && current.right == null) {
                    output.write(current.data);
                    current = root;
                }
            }

            Files.write(Paths.get(outputFile), output.toByteArray());
        }
    }
}

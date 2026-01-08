import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FileCompressor {

    public static void compress(String inputFile, String outputFile) throws Exception {

        byte[] data = Files.readAllBytes(Paths.get(inputFile));

        Map<Byte, Integer> freqMap = new HashMap<>();
        for (byte b : data) {
            freqMap.put(b, freqMap.getOrDefault(b, 0) + 1);
        }

        HuffmanNode root = HuffmanTree.buildTree(freqMap);

        HuffmanEncoder encoder = new HuffmanEncoder();
        Map<Byte, String> codes = encoder.generateCodes(root);

        try (ObjectOutputStream oos =
                 new ObjectOutputStream(new FileOutputStream(outputFile))) {

            oos.writeObject(freqMap); // metadata

            BitOutputStream bos = new BitOutputStream(oos);

            for (byte b : data) {
                String code = codes.get(b);
                for (char c : code.toCharArray()) {
                    bos.writeBit(c == '1' ? 1 : 0);
                }
            }
            bos.close();
        }
    }
}

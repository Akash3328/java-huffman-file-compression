public class Main {

    public static void main(String[] args) throws Exception {

        if (args.length < 3) {
            System.out.println("Usage:");
            System.out.println("java Main compress input.pdf output.huff");
            System.out.println("java Main decompress input.huff output.pdf");
            return;
        }

        if (args[0].equalsIgnoreCase("compress")) {
            FileCompressor.compress(args[1], args[2]);
            System.out.println("Compression completed.");
        } else if (args[0].equalsIgnoreCase("decompress")) {
            FileDecompressor.decompress(args[1], args[2]);
            System.out.println("Decompression completed.");
        }
    }
}

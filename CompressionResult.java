public class CompressionResult {
    String encodedData;
    HuffmanNode root;
    int originalLength;

    public CompressionResult(String encodedData, HuffmanNode root, int originalLength) {
        this.encodedData = encodedData;
        this.root = root;
        this.originalLength = originalLength;
    }
}

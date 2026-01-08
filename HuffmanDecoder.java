public class HuffmanDecoder {

    public String decode(String encodedData, HuffmanNode root) {

        StringBuilder decoded = new StringBuilder();
        HuffmanNode current = root;

        for (char bit : encodedData.toCharArray()) {
            current = (bit == '0') ? current.left : current.right;

            if (current.left == null && current.right == null) {
                decoded.append(current.data);
                current = root;
            }
        }

        return decoded.toString();
    }
}

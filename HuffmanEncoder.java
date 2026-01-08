import java.util.*;

public class HuffmanEncoder {

    private final Map<Byte, String> codes = new HashMap<>();

    public Map<Byte, String> generateCodes(HuffmanNode root) {
        buildCodes(root, "");
        return codes;
    }

    private void buildCodes(HuffmanNode node, String code) {
        if (node == null) return;

        if (node.left == null && node.right == null) {
            codes.put(node.data, code);
        }

        buildCodes(node.left, code + "0");
        buildCodes(node.right, code + "1");
    }
}

import java.util.*;

public class HuffmanTree {

    public static HuffmanNode buildTree(Map<Byte, Integer> freqMap) {

        PriorityQueue<HuffmanNode> pq =
            new PriorityQueue<>(Comparator.comparingInt(n -> n.frequency));

        for (var entry : freqMap.entrySet()) {
            pq.add(new HuffmanNode(entry.getKey(), entry.getValue()));
        }

        while (pq.size() > 1) {
            HuffmanNode left = pq.poll();
            HuffmanNode right = pq.poll();

            HuffmanNode parent =
                new HuffmanNode((byte) 0, left.frequency + right.frequency);
            parent.left = left;
            parent.right = right;

            pq.add(parent);
        }

        return pq.poll();
    }
}

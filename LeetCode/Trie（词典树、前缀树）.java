class Trie {
    class Node{
        boolean isLeaf;
        Map<Character,Node> content;

        public Node() {
            content = new HashMap<>();
        }
    }

    Node root;

    /** Initialize your data structure here. */
    public Trie() {
        root = new Node();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        if(word!=null||word.length()>0) {
            char[] charArr = word.toCharArray();
            Node node=root;
            Node tmpNode;
            for(char c:charArr){
                tmpNode = node.content.get(c);
                if(tmpNode==null){
                    tmpNode = new Node();
                    node.content.put(c,tmpNode);
                }
                node = tmpNode;
            }
            node.isLeaf = true;
        }
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        if(word!=null||word.length()>0) {
            char[] charArr = word.toCharArray();
            Node node=root;
            Node tmpNode=null;
            for(char c:charArr){
                tmpNode = node.content.get(c);
                if(tmpNode!=null){
                    node = tmpNode;
                }else{
                    return false;
                }
            }
            return tmpNode.isLeaf;
        }
        return false;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        if(prefix!=null||prefix.length()>0) {
            char[] charArr = prefix.toCharArray();
            Node node=root;
            Node tmpNode;
            for(char c:charArr){
                tmpNode = node.content.get(c);
                if(tmpNode==null){
                    return false;
                }
                node = tmpNode;
            }
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
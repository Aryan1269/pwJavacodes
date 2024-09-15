
class InnerstaticBlock {

    static {
        System.out.println("block3");
    }
}

class staticBlock {

    /*
     * whenever class load it execute static block
     */
    static {
        System.out.println("block1");
    }

    public static void main(String[] args) {
        InnerstaticBlock i = new InnerstaticBlock();
        System.out.println("main");
    }

    static {
        System.out.println("block2");
    }
}
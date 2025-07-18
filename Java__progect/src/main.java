public class main  { 
    public static void main(String[] args) {
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.add(new snake());
        frame.setTitle("Snake Game");
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
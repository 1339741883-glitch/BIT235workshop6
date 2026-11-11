public class Boxes {
    private int size;

    // Constructor accepts box size value
    public Boxes(int size){
        setSize(size);
    }

    // Setter method to update box size, limit max size to 10
    public void setSize(int size){
        if(size > 10) size = 10;
        if(size < 1) size =1;
        this.size = size;
    }

    // Override toString, return size string like "10 x 10"
    @Override
    public String toString() {
        return size + " x " + size;
    }

    // Draw square box shape to system console
    public void draw(){
        // Print top border line
        for(int i=0; i< size; i++){
            System.out.print("-");
        }
        System.out.println();

        // Print middle rows with vertical side borders
        for(int row =0; row < size -2; row++){
            System.out.print("|");
            for(int col=0; col < size-2; col++){
                System.out.print(" ");
            }
            System.out.println("|");
        }

        // Print bottom border line
        for(int i=0; i< size; i++){
            System.out.print("-");
        }
        System.out.println();
    }
}

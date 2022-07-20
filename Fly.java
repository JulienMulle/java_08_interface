public interface Fly {
    public void takeOff();

    public void land();

    public default void glide(){
        System.out.println("glide in the air");
    };

    public int ascend(int meters);

    public int descend(int meters);

}
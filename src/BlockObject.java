public class BlockObject implements Block{
    private String color;
    private String material;
    public BlockObject(String color, String material){
        this.color=color;
        this.material=material;
    }

    @Override
    public String getColor() {
        return color;
    }
    @Override
    public String getMaterial() {
        return material;
    }
}

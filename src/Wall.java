import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure, CompositeBlock {

    public List<Block> blocks;

    //Ewentualnie return blocks.size();
    @Override
    public int count(){
        int i = 0;
        if(blocks!=null) {
            for (Block block : blocks) {
                i++;
            }
        }
        return i;
    }

    //zakładam, że kolor stanowi identyfikator bloku
    @Override
    public Optional<Block> findBlockByColor(String color){
        for (Block block : blocks){
            if(block.getColor().equals(color)){
                return Optional.of(block);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        List<Block> blocksByMaterial = blocks;
        if (blocksByMaterial!=null) {
            for (Block block : blocks) {
                if (block.getMaterial().equals(material)) {
                    blocksByMaterial.add(block);
                }
            }
        }
        return blocksByMaterial;
    }

    //Ewentualnie return blocks;
    @Override
    public List<Block> getBlocks(){
        List<Block>allBlocks=blocks;
        if(allBlocks!=null) {
            allBlocks.addAll(blocks);
        }
        return allBlocks;
    }
    //Nie widzę zastosowania implementacji getColor() i getMaterial(), dla tego zostawiam tak jak jest poniżej
    @Override
    public String getColor(){
        return null;
    }
    @Override
    public String getMaterial(){
        return null;
    }

}

public class ColoredItem  extends Item implements IColor{

    private Color color;


    public ColoredItem() {
        super();
        color = Color.NONE;
    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public void paint(Color color) {

    }
}

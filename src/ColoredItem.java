public class ColoredItem extends Item implements IColor{

    private Color color;


    public ColoredItem(String name, String description, double weight ) {
        super(name, description, weight);
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

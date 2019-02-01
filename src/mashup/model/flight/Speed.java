package mashup.model.flight;

public class Speed {
    private String horizontal;

    private String vertical;

    private String isGround;

    public String getHorizontal ()
    {
        return horizontal;
    }

    public void setHorizontal (String horizontal)
    {
        this.horizontal = horizontal;
    }

    public String getVertical ()
    {
        return vertical;
    }

    public void setVertical (String vertical)
    {
        this.vertical = vertical;
    }

    public String getIsGround ()
    {
        return isGround;
    }

    public void setIsGround (String isGround)
    {
        this.isGround = isGround;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [horizontal = "+horizontal+", vertical = "+vertical+", isGround = "+isGround+"]";
    }
}

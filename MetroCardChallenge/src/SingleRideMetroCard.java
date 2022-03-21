public class SingleRideMetroCard extends MetroCard
{

    // INSTANCE VARIABLES (if any)
    private boolean active=true;



    // CONSTRUCTOR(S)
    public SingleRideMetroCard()
    {
        super();
    }



    // METHODS (if any), including overridden methods
    @Override
    public boolean swipe()
    {
        if(active)
        {
            active=false;
            return true;
        }
        return false;
    }

}

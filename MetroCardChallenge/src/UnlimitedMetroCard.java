public class UnlimitedMetroCard extends MetroCard
{
    private int daysLeft;

    public UnlimitedMetroCard(int days)
    {
        super();
        daysLeft=days;
    }

    @Override
    public boolean swipe()
    {
        if(daysLeft>0)
        {return true;}
        return false;
    }

    public void dayPassed() {daysLeft--;}
}

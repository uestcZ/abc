package exercise.exercise4.unusual;

public class AuctionTest {
    private double iniPrice = 30.0 ;
    public void bid(String bidPrice)
            throws AuctionException
    {
        double d = 0.0;
        try
        {
            d = Double.parseDouble(bidPrice);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw new AuctionException("不能");
        }
        if (iniPrice>d)
        {
            throw new AuctionException("不允许");
        }
        iniPrice = d;
    }

    public static void main(String[] args) {
        AuctionTest at = new AuctionTest();
        try
        {
            at.bid("df");
        }
        catch (AuctionException ae)
        {
            System.err.println(ae.getMessage());
        }
    }
}

class AuctionException extends Exception
{
    public AuctionException()
    {

    }
    public  AuctionException(String msg)
    {
        super(msg);
    }
}

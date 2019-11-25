
/**
 * Short Assessed Programming Exercise 1
 *
 * @julia
 * @15/01/19
 */
class TestCounter
{
    public static void main(String[]arg)
    {
        Counter ctr = new Counter();
        Counter ctr2 = new Counter(150);
        ctr.increment();
        System.out.println(ctr.getValue());
        ctr.reset();
    }
     
}

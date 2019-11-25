
/**
 * Short Assessed Programming Exercise 1
 *
 * @julia
 * @15/01/19
 */
class Counter
{
    // instance variables - replace the example below with your own
    private int count;

    public Counter(int initialCount)
    {
        count = initialCount;
    }
    
    public Counter()
    {
        count = 0;
    }

    public void increment() 
    {
        count += 1;
    }
    
    public void reset() 
    {
       count = 0; 
    }
    
    public int getValue()
    {
        return count;
    }
}

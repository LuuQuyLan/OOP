import org.junit.Test;

public class Week4Test {
    @Test
    public void testMax2Int1(){
        assertEquals(2, Week4.max2Int(1, 2));
    }

    @Test
    public void testMax2Int2(){
        assertEquals(3, Week4.max2Int(1, 3));
    }

    @Test
    public void testMax2Int3(){
        assertEquals(10, Week4.max2Int(9, 10));
    }

    @Test
    public void testMax2Int4(){
        assertEquals(5, Week4.max2Int(5, 3));
    }

    @Test
    public void testMax2Int5(){
        assertEquals(9, Week4.max2Int(9, 3));
    }

    @Test
    public void testMinArray1(){
        int []arr = {1, 2}; 
        assertEquals(1, Week4.minArray(arr));
    }

    @Test
    public void testMinArray2(){
        int []arr = {1, 2, 3, 4, 5}; 
        assertEquals(1, Week4.minArray(arr));
    }

    @Test
    public void testMinArray3(){
        int []arr = {1, 2, 3, 4, 5}; 
        assertEquals(1, Week4.minArray(arr));
    }

    @Test
    public void testMinArray4(){
        int []arr = {1, 2, 3, 4, 5}; 
        assertEquals(1, Week4.minArray(arr));
    }

    @Test
    public void testMinArray5(){
        int []arr = {1, 2, 3, 4, 5}; 
        assertEquals(1, Week4.minArray(arr));
    }

    @Test
    public void testCalculateBMI1(){
        assertEquals("Thiếu cân", Week4.calculateBMI(54, 1.72));
    }

    @Test
    public void testCalculateBMI2(){
        assertEquals("Thiếu cân", Week4.calculateBMI(54, 1.72));
    }

    @Test
    public void testCalculateBMI3(){
        assertEquals("Bình thường", Week4.calculateBMI(70, 1.75));
    }

    @Test
    public void testCalculateBMI4(){
        assertEquals("Bình thường", Week4.calculateBMI(70, 1.75));
    }

    @Test
    public void testCalculateBMI5(){
        assertEquals("Bình thường", Week4.calculateBMI(70, 1.75));
    }
}
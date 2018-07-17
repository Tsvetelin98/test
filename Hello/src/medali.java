
public class medali {
	public static void main(String[] args)
	{
final int C=7;
final int medals=3;
String[] c=
{
		"Canada",
		"Bulgaria",
		"China",
		"Germany",
		"Russia",
		"Japan",
		"Romania"
};

int[][] counts=
{
		{1,0,1},
		{6,1,0},
		{0,0,1},
		{1,0,0},
		{0,1,1},
		{0,1,1},
		{1,1,0}
};
System.out.println("       Country      Gold  Silver    Bronze  Total");

for (int i=0;i<C;i++)
{
	System.out.printf("%15s",c[i]);
	int total=0;
	for (int j=0;j<medals;j++)
	{
		System.out.printf("%8d",counts[i][j]);
		total=total+counts[i][j];
	}
	System.out.printf("%8d\n", total);
}}}

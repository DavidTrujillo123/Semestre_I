using System;

namespace Repaso_If_3
{
	class Program
	{

		static void Main(string[] args)
		{
			int pedro;
			int mario;
			int juan;

			
			pedro = 20;
			mario = 10;
			juan = 20;

			if (pedro < 0 || mario < 0 || juan < 0) Console.WriteLine("Error! Digite nuevamente las edades");
			else {
				if (pedro == mario)
				{
					if (pedro == juan) Console.WriteLine("Los tres son comtemporaneos");
					else Console.WriteLine("Pedro y Mario son comtemporaneos");
				}
				else
				{
					if (pedro == juan) Console.WriteLine("Pedro y Juan son comtemporaneos");
					else
					{
						if (mario == juan) Console.WriteLine("Mario y Juan son comtemporaneos");
						else Console.WriteLine("Ninguno es comtemporaneo");
					}
				}
			}
			Console.ReadKey();
		}
	}
}

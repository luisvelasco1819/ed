using System;

namespace CSuma
{
    class MainClass
    {
        public static void Main(string[] args)
        {
			decimal primerNumero = readDecimal("Primer número: ");
			decimal segundoNumero = readDecimal("Segundo número: ");
			decimal suma = primerNumero + segundoNumero;
            Console.WriteLine("Suma=" + suma);
        }

		private static decimal readDecimal(string label) {
			Console.Write(label);
			string stringDecimal = Console.ReadLine();
			return decimal.Parse(stringDecimal);
		}
    }
}

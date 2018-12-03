using System;

namespace CVector
{
    class Vector
    {
        public static void Main(string[] args)
        {
			Console.WriteLine("Hello World!");
			Array.ForEach(new int[] { 3, 5, 7 }, item => Console.WriteLine("item=" + item));

        }

		public static int BinarySearch(int[] v, int x) {
			int count = v.Length;
			int left = 0;
			int rigth = count - 1;
			int middle = (left + rigth) / 2;
			while ( left < rigth && v[middle] != x) {
				if (...)
					left = middle + 1;
				else
					rigth = middle - 1;
				middle = (left + rigth) / 2;
			}
			if (left > rigth)
				return -1;
			if (v[middle] == x)
				return middle;
			return -1;
		}
    }
}

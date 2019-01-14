using System;
using System.Collections.Generic;

namespace CBingo
{
    public class Bombo
    {
		private IList<int> bolas = new List<int>();
		private Random random = new Random();
        public Bombo()
        {
			for (int bola = 1; bola <= 10; bola++)
				bolas.Add(bola);
        }

		public int sacarBola() {
			int indexAleatorio = random.Next(bolas.Count);
			int bola = bolas[indexAleatorio];
			bolas.RemoveAt(indexAleatorio);
			return bola;
		}

		public bool quedanBolas() {
			return bolas.Count > 0;
		}
    }
}

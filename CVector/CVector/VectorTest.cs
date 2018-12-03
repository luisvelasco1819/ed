using NUnit.Framework;
using System;
namespace CVector
{
    [TestFixture]
    public class VectorTest
    {
        [Test]
        public void BinarySearch()
        {
			Assert.AreEqual(-1, Vector.BinarySearch(new int[] {45}, 33));
        }
    }
}

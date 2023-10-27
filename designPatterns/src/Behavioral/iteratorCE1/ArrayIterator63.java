package Behavioral.iteratorCE1;

public class ArrayIterator63 extends Iterator63{
   ArrayCollection63 array;
   int index = -1;
   protected ArrayIterator63(ArrayCollection63 array) {
      this.array = array;
   }

   @Override
   public Object first() {
      index = 0;
      if(array.count() > 0) {
         index = 0;
         return array.getItem(index);
      }
      return null;
   }

   @Override
   public Object next() {
      if (!isDone())
          return array.getItem(++index);
      return null;
   }

   @Override
   public Object currentItem() {
      if (index >= 0)
         return array.getItem(index);
      return null;
   }

   @Override
   public boolean isDone() {
      return (index == array.count() - 1);
   }
}

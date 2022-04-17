import org.junit.Test;
import static org.junit.Assert.fail;

public class CustomTestAVLTree {

  @Test
  public void test01()  throws Throwable  {
    try {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(0);
      aVLTree0.height();
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(0);
      aVLTree0.delete(920);
      aVLTree_Node0.left = aVLTree0.getRoot();
      aVLTree0.find(0);
      aVLTree0.find(0);
      int int0 = aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.insert(int0);
    }catch(StackOverflowError error) {
      fail("Stack is overflowed because of no right null check");
    }
  }
}

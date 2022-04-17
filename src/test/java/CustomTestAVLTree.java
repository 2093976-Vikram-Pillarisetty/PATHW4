import org.junit.Test;
import static org.junit.Assert.*;

public class CustomTestAVLTree {
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    AVLTree avltree1 = new AVLTree();
    AVLTree.Node node2 = avltree1.find(6);
    AVLTree.Node node3 = avltree1.getRoot();
    avltree1.delete(110);
    avltree1.insert(20);
    AVLTree.Node node8 = avltree1.getRoot();
    avltree1.insert(0);
      avltree1.delete(20);
      fail("Expecting null pointer exception");
    }catch(Exception ignored){
      fail("Expecting null pointer exception");
    }
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    AVLTree avltree1 = new AVLTree();
      avltree1.insert((-3268));
      avltree1.insert(1781);
      avltree1.delete(673);
      avltree1.insert(0);
      avltree1.insert((-781));
      avltree1.delete((-781));
      AVLTree.Node aVLTree_Node0 = avltree1.getRoot();
      avltree1.delete((-945));
      AVLTree.Node aVLTree_Node1 = aVLTree_Node0.left;
      avltree1.insert((-461));
      aVLTree_Node0.left.key = (-1472);
      aVLTree_Node1.height = (-945);
      aVLTree_Node0.height = 673;
      aVLTree_Node0.key = (-781);
      avltree1.insert(381);
      avltree1.getBalance(aVLTree_Node0);
      fail("Null Pointer Exception Expected");
    }catch(Exception ignored){
      fail("Expecting null pointer exception");
    }
  }

  @Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    AVLTree avltree3 = new AVLTree();
    avltree3.insert(11);
    avltree3.insert(52);
    avltree3.insert(25);
    avltree3.insert(83);
      avltree3.delete(52);
      avltree3.delete(25);
      avltree3.delete(83);
      fail("Expected Null Pointer Exception");
    }catch(Exception ignored){
      fail("Expecting null pointer exception");
    }
  }
}

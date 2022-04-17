import org.junit.Test;

import static org.junit.Assert.*;

public class CustomTestAVLTree {
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node2 = aVLTree0.find(6);
    AVLTree.Node node3 = aVLTree0.getRoot();
    aVLTree0.delete(110);
    aVLTree0.insert(20);
    AVLTree.Node node8 = aVLTree0.getRoot();
    aVLTree0.insert(0);
    try {
      aVLTree0.delete(20);
      fail("Expecting null pointer exception");
    }catch(Exception ignored){
      fail("Expecting null pointer exception");
    }
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
    AVLTree aVLTree0 = new AVLTree();
    try {
      aVLTree0.insert((-3268));
      aVLTree0.insert(1781);
      aVLTree0.delete(673);
      aVLTree0.insert(0);
      aVLTree0.insert((-781));
      aVLTree0.delete((-781));
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      aVLTree0.delete((-945));
      AVLTree.Node aVLTree_Node1 = aVLTree_Node0.left;
      aVLTree0.insert((-461));
      aVLTree_Node0.left.key = (-1472);
      aVLTree_Node1.height = (-945);
      aVLTree_Node0.height = 673;
      aVLTree_Node0.key = (-781);
      aVLTree0.insert(381);
      aVLTree0.getBalance(aVLTree_Node0);
      fail("Null Pointer Exception Expected");
    }catch(Exception ignored){
      fail("Expecting null pointer exception");
    }
  }

  @Test(timeout = 4000)
  public void test3() throws Throwable {
    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(11);
    aVLTree0.insert(52);
    aVLTree0.insert(25);
    aVLTree0.insert(83);
    try {
      aVLTree0.delete(52);
      aVLTree0.delete(25);
      aVLTree0.delete(83);
      fail("Expected Null Pointer Exception");
    }catch(Exception ignored){
      fail("Expecting null pointer exception");
    }
  }
}

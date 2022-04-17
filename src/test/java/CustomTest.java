import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.runner.RunWith;

public class CustomTest {
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node2 = aVLTree0.find((int) '4');
    AVLTree.Node node3 = aVLTree0.getRoot();
    aVLTree0.delete(100);
    aVLTree0.insert((int) (byte) 10);
    AVLTree.Node node8 = aVLTree0.getRoot();
    aVLTree0.insert((int) (short) 0);

    try {
      aVLTree0.delete(10);
      fail("Expecting null pointer exception");
    }catch(NullPointerException ignored){

    }
  }

  @Test(timeout = 4000)
  public void test00() throws Throwable {
    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert((-3240));
    aVLTree0.insert(1779);
    aVLTree0.delete(663);
    aVLTree0.insert(0);
    aVLTree0.insert((-791));
    aVLTree0.delete((-791));
    AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
    aVLTree0.delete((-935));
    AVLTree.Node aVLTree_Node1 = aVLTree_Node0.left;
    aVLTree_Node0.left = aVLTree_Node1;
    aVLTree0.insert((-450));
    aVLTree_Node0.left.key = (-1467);
    aVLTree_Node0.height = 391;
    aVLTree_Node0.key = (-791);
    aVLTree_Node1.height = (-935);
    aVLTree_Node0.height = (-791);
    aVLTree_Node0.height = 663;
    aVLTree_Node0.key = (-791);
    aVLTree0.insert(391);
    aVLTree0.getBalance(aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test009() throws Throwable {
    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(10);
    aVLTree0.insert(50);
    aVLTree0.insert(22);
    aVLTree0.insert(80);
    try {
      aVLTree0.delete(50);
      aVLTree0.delete(22);
      aVLTree0.delete(80);
      fail("Null pointer exception");
    }catch(NullPointerException ignored){

    }
  }
}


/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 12 20:10:32 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AVLTree_ESTest extends AVLTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-1));
      aVLTree0.delete(6835);
      aVLTree0.height();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(2581);
      aVLTree0.insert(1725);
      aVLTree0.insert(0);
      aVLTree0.insert((-2018));
      aVLTree0.delete(2581);
      aVLTree0.find(1);
      aVLTree0.height();
      aVLTree0.getRoot();
      // Undeclared exception!
      try { 
        aVLTree0.insert(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(0);
      aVLTree0.delete(115);
      aVLTree0.delete((-1));
      aVLTree0.insert((-1));
      aVLTree0.delete(1);
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(1040);
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      AVLTree.Node aVLTree_Node2 = aVLTree0.find((-1));
      aVLTree_Node2.height = 1040;
      aVLTree_Node2.key = 1;
      aVLTree0.getBalance(aVLTree_Node1);
      // Undeclared exception!
      try { 
        aVLTree0.delete(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.getRoot();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete((-1));
      aVLTree0.height();
      aVLTree0.insert((-1));
      AVLTree.Node aVLTree_Node0 = aVLTree0.find((-1));
      aVLTree0.getBalance(aVLTree_Node0);
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree_Node0.right = aVLTree_Node1;
      int int0 = (-362);
      aVLTree0.delete((-1));
      aVLTree0.insert(int0);
      aVLTree0.height();
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.getRoot();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-610));
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      AVLTree.Node aVLTree_Node1 = aVLTree0.find((-610));
      aVLTree_Node0.right = aVLTree_Node1;
      aVLTree_Node0.height = (-610);
      aVLTree0.delete((-610));
      aVLTree0.getBalance(aVLTree_Node0);
      // Undeclared exception!
      aVLTree0.find((-1));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(0);
      aVLTree0.insert(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      AVLTree.Node aVLTree_Node1 = aVLTree0.find(0);
      aVLTree_Node1.right = aVLTree_Node0;
      aVLTree0.getBalance(aVLTree_Node1);
      int int0 = 0;
      aVLTree_Node0.left = aVLTree_Node1.right;
      AVLTree.Node aVLTree_Node2 = aVLTree0.getRoot();
      aVLTree_Node0.height = 0;
      aVLTree_Node2.left = aVLTree_Node0;
      AVLTree.Node aVLTree_Node3 = aVLTree_Node2.right;
      aVLTree_Node1.left = aVLTree_Node3;
      // Undeclared exception!
      aVLTree0.delete(0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(39);
      aVLTree0.insert(0);
      aVLTree0.delete(115);
      aVLTree0.delete((-15));
      aVLTree0.insert((-15));
      aVLTree0.delete(1);
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(1040);
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      AVLTree.Node aVLTree_Node2 = aVLTree0.find((-15));
      aVLTree_Node2.height = 1040;
      aVLTree_Node2.key = 1;
      aVLTree0.getBalance(aVLTree_Node1);
      // Undeclared exception!
      try { 
        aVLTree0.insert(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete((-793));
      aVLTree0.insert(0);
      aVLTree0.delete(0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-543));
      aVLTree0.insert(902);
      aVLTree0.height();
      aVLTree0.insert(1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.find((-1751));
      aVLTree0.getBalance((AVLTree.Node) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete((-1596));
      aVLTree0.delete((-1596));
      aVLTree0.delete(1315);
      aVLTree0.delete((-2659));
      aVLTree0.height();
      aVLTree0.height();
      int int0 = (-3193);
      aVLTree0.delete((-3193));
      aVLTree0.delete((-1));
      aVLTree0.insert(2966);
      aVLTree0.insert((-1));
      aVLTree0.insert(1929);
      aVLTree0.height();
      AVLTree.Node aVLTree_Node0 = aVLTree0.find((-1));
      aVLTree0.getRoot();
      aVLTree0.getRoot();
      aVLTree0.insert(1315);
      aVLTree0.getBalance(aVLTree_Node0);
      // Undeclared exception!
      try { 
        aVLTree0.insert((-1));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(509);
      aVLTree0.delete((-3263));
      aVLTree0.delete((-3263));
      aVLTree0.insert(1);
      aVLTree0.delete(1);
      aVLTree0.insert(0);
      aVLTree0.delete(0);
      aVLTree0.delete(1);
      aVLTree0.insert((-1845));
      aVLTree0.find(0);
      aVLTree0.insert(0);
      aVLTree0.height();
      aVLTree0.delete(1);
      aVLTree0.delete(1260);
      aVLTree0.insert((-600));
      aVLTree0.find(1260);
      aVLTree0.find((-3263));
      aVLTree0.find(114);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(0);
      aVLTree0.delete(0);
      aVLTree0.delete(0);
      aVLTree0.delete(1);
      aVLTree0.insert(1);
      aVLTree0.getRoot();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(1);
      aVLTree0.delete(1);
      int int0 = (-761);
      aVLTree0.insert((-761));
      aVLTree0.insert(0);
      int int1 = 1353;
      aVLTree0.insert(1353);
      aVLTree0.insert((-5582));
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      aVLTree_Node0.height = (-1366);
      AVLTree.Node aVLTree_Node1 = aVLTree_Node0.left;
      aVLTree_Node0.height = 0;
      aVLTree_Node1.right = aVLTree_Node0;
      aVLTree_Node1.right = aVLTree_Node0;
      int int2 = aVLTree0.getBalance(aVLTree_Node1);
      aVLTree0.delete(int0);
      int int3 = aVLTree0.height();
      aVLTree0.delete(int1);
      aVLTree0.find(int2);
      aVLTree0.delete(int3);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete((-2661));
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node((-79));
      aVLTree0.insert(0);
      aVLTree0.insert((-79));
      int int0 = (-402);
      aVLTree0.insert((-402));
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree_Node1.key = (-79);
      aVLTree_Node1.height = 0;
      aVLTree0.insert(1);
      aVLTree0.find(0);
      aVLTree0.getBalance(aVLTree_Node1);
      aVLTree0.getRoot();
      aVLTree0.delete((-79));
      // Undeclared exception!
      try { 
        aVLTree0.insert(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(867);
      aVLTree0.delete(1);
      aVLTree0.delete((-1862));
      aVLTree0.delete((-139));
      aVLTree0.find((-534));
  }
}

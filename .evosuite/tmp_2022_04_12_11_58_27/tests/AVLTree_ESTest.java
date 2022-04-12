/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 12 17:00:22 GMT 2022
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
      aVLTree0.delete((-1));
      aVLTree0.height();
      aVLTree0.insert((-1));
      AVLTree.Node aVLTree_Node0 = aVLTree0.find((-1));
      aVLTree0.getBalance(aVLTree_Node0);
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree_Node0.right = aVLTree_Node1;
      aVLTree0.delete((-1));
      // Undeclared exception!
      try { 
        aVLTree0.insert((-362));
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = 0;
      aVLTree0.delete(0);
      aVLTree0.insert(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      aVLTree_Node0.left = aVLTree_Node0;
      int int1 = 861;
      aVLTree0.insert(861);
      aVLTree_Node0.right = aVLTree_Node0;
      aVLTree0.delete(int1);
      aVLTree_Node0.right = aVLTree_Node0;
      aVLTree_Node0.right.height = int1;
      aVLTree_Node0.right.left = aVLTree_Node0.left;
      aVLTree_Node0.right = aVLTree_Node0;
      aVLTree_Node0.left.left = aVLTree_Node0.right;
      aVLTree_Node0.right = aVLTree_Node0;
      aVLTree_Node0.right.height = int1;
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.find(int1);
      aVLTree0.height();
      aVLTree0.height();
      aVLTree0.insert(int0);
      aVLTree0.height();
      aVLTree0.delete(int0);
      aVLTree0.height();
      int int2 = 0;
      aVLTree0.find(int2);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      int int0 = 840;
      aVLTree0.insert(840);
      assertEquals(0, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node((-1226));
      assertNotNull(aVLTree_Node0);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.delete((-1));
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert(2728);
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node1 = aVLTree0.find(840);
      assertNotNull(aVLTree_Node1);
      assertFalse(aVLTree_Node1.equals((Object)aVLTree_Node0));
      assertEquals(1, aVLTree0.height());
      assertNotSame(aVLTree_Node1, aVLTree_Node0);
      
      aVLTree0.insert(6);
      assertEquals(2, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node2 = aVLTree0.find((-1226));
      assertNull(aVLTree_Node2);
      assertEquals(2, aVLTree0.height());
      
      aVLTree_Node1.left = aVLTree_Node0;
      assertEquals(2, aVLTree0.height());
      
      aVLTree_Node1.left = aVLTree_Node0;
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.insert((-1));
      assertEquals(2, aVLTree0.height());
      
      aVLTree_Node1.left.left = aVLTree_Node0;
      assertEquals(2, aVLTree0.height());
      
      aVLTree_Node1.left = aVLTree_Node0;
      assertEquals(2, aVLTree0.height());
      
      aVLTree_Node0.left = aVLTree_Node1;
      assertEquals(2, aVLTree0.height());
      
      aVLTree_Node1.key = 1464;
      assertEquals(2, aVLTree0.height());
      
      aVLTree_Node1.right = aVLTree_Node0;
      assertEquals(2, aVLTree0.height());
      
      aVLTree_Node1.left.right = aVLTree_Node1.left;
      assertEquals(2, aVLTree0.height());
      
      int int1 = aVLTree0.getBalance(aVLTree_Node1);
      assertFalse(int1 == int0);
      assertFalse(aVLTree_Node1.equals((Object)aVLTree_Node0));
      assertEquals(0, int1);
      assertEquals(2, aVLTree0.height());
      assertNotSame(aVLTree_Node1, aVLTree_Node0);
      
      int int2 = aVLTree0.getBalance(aVLTree_Node1);
      assertTrue(int2 == int1);
      assertFalse(int2 == int0);
      assertFalse(aVLTree_Node1.equals((Object)aVLTree_Node0));
      assertEquals(0, int2);
      assertEquals(2, aVLTree0.height());
      assertNotSame(aVLTree_Node1, aVLTree_Node0);
      
      AVLTree.Node aVLTree_Node3 = aVLTree0.getRoot();
      assertNotNull(aVLTree_Node3);
      assertFalse(aVLTree_Node3.equals((Object)aVLTree_Node0));
      assertEquals(2, aVLTree0.height());
      assertSame(aVLTree_Node3, aVLTree_Node1);
      assertNotSame(aVLTree_Node3, aVLTree_Node0);
      
      int int3 = aVLTree0.height();
      assertFalse(int3 == int0);
      assertFalse(int3 == int1);
      assertFalse(int3 == int2);
      assertEquals(2, int3);
      assertEquals(2, aVLTree0.height());
      
      int int4 = aVLTree0.height();
      assertFalse(int4 == int0);
      assertFalse(int4 == int1);
      assertFalse(int4 == int2);
      assertTrue(int4 == int3);
      assertEquals(2, int4);
      assertEquals(2, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node4 = aVLTree0.find((-1226));
      assertNotNull(aVLTree_Node4);
      assertFalse(aVLTree_Node4.equals((Object)aVLTree_Node3));
      assertFalse(aVLTree_Node4.equals((Object)aVLTree_Node1));
      assertEquals(2, aVLTree0.height());
      assertNotSame(aVLTree_Node4, aVLTree_Node3);
      assertNotSame(aVLTree_Node4, aVLTree_Node1);
      assertSame(aVLTree_Node4, aVLTree_Node0);
      
      int int5 = aVLTree0.height();
      assertFalse(int5 == int2);
      assertFalse(int5 == int0);
      assertFalse(int5 == int1);
      assertTrue(int5 == int3);
      assertTrue(int5 == int4);
      assertEquals(2, int5);
      assertEquals(2, aVLTree0.height());
      
      int int6 = aVLTree0.height();
      assertTrue(int6 == int5);
      assertTrue(int6 == int3);
      assertFalse(int6 == int2);
      assertTrue(int6 == int4);
      assertFalse(int6 == int0);
      assertFalse(int6 == int1);
      assertEquals(2, int6);
      assertEquals(2, aVLTree0.height());
      
      int int7 = aVLTree0.height();
      assertFalse(int7 == int0);
      assertTrue(int7 == int3);
      assertTrue(int7 == int4);
      assertTrue(int7 == int6);
      assertFalse(int7 == int1);
      assertFalse(int7 == int2);
      assertTrue(int7 == int5);
      assertEquals(2, int7);
      assertEquals(2, aVLTree0.height());
      
      // Undeclared exception!
      try { 
        aVLTree0.insert((-1324));
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert((-87));
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert(902);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.delete((-263));
      assertEquals(1, aVLTree0.height());
      
      int int0 = aVLTree0.height();
      assertEquals(1, int0);
      assertEquals(1, aVLTree0.height());
      
      int int1 = aVLTree0.height();
      assertTrue(int1 == int0);
      assertEquals(1, int1);
      assertEquals(1, aVLTree0.height());
      
      int int2 = aVLTree0.height();
      assertTrue(int2 == int0);
      assertTrue(int2 == int1);
      assertEquals(1, int2);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(1, aVLTree0.height());
      
      int int3 = aVLTree0.height();
      assertTrue(int3 == int2);
      assertTrue(int3 == int0);
      assertTrue(int3 == int1);
      assertEquals(1, int3);
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      assertNotNull(aVLTree_Node0);
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert((-1));
      assertEquals(0, aVLTree0.height());
      
      int int0 = aVLTree0.height();
      assertEquals(0, int0);
      assertEquals(0, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.delete((-1596));
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.delete((-1596));
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.delete(1315);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.delete((-2659));
      assertEquals((-1), aVLTree0.height());
      
      int int0 = aVLTree0.height();
      assertEquals((-1), int0);
      assertEquals((-1), aVLTree0.height());
      
      int int1 = aVLTree0.height();
      assertTrue(int1 == int0);
      assertEquals((-1), int1);
      assertEquals((-1), aVLTree0.height());
      
      int int2 = (-3193);
      aVLTree0.delete((-3193));
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.delete((-1));
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert(2966);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert((-1));
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert(1929);
      assertEquals(1, aVLTree0.height());
      
      int int3 = aVLTree0.height();
      assertFalse(int3 == int2);
      assertFalse(int3 == int0);
      assertFalse(int3 == int1);
      assertEquals(1, int3);
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.find((-1));
      assertNotNull(aVLTree_Node0);
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      assertNotNull(aVLTree_Node1);
      assertFalse(aVLTree_Node1.equals((Object)aVLTree_Node0));
      assertEquals(1, aVLTree0.height());
      assertNotSame(aVLTree_Node1, aVLTree_Node0);
      
      AVLTree.Node aVLTree_Node2 = aVLTree0.getRoot();
      assertNotNull(aVLTree_Node2);
      assertFalse(aVLTree_Node2.equals((Object)aVLTree_Node0));
      assertEquals(1, aVLTree0.height());
      assertNotSame(aVLTree_Node2, aVLTree_Node0);
      assertSame(aVLTree_Node2, aVLTree_Node1);
      
      aVLTree0.insert(1315);
      assertEquals(2, aVLTree0.height());
      
      int int4 = aVLTree0.getBalance(aVLTree_Node0);
      assertTrue(int4 == int3);
      assertFalse(int4 == int0);
      assertFalse(int4 == int1);
      assertFalse(int4 == int2);
      assertFalse(aVLTree_Node0.equals((Object)aVLTree_Node2));
      assertFalse(aVLTree_Node0.equals((Object)aVLTree_Node1));
      assertEquals(1, int4);
      assertEquals(2, aVLTree0.height());
      assertNotSame(aVLTree_Node0, aVLTree_Node2);
      assertNotSame(aVLTree_Node0, aVLTree_Node1);
      
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
  public void test06()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.delete(115);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.delete((-1));
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert((-1));
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.delete(1);
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(1040);
      assertNotNull(aVLTree_Node0);
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      assertNotNull(aVLTree_Node1);
      assertFalse(aVLTree_Node1.equals((Object)aVLTree_Node0));
      assertEquals(1, aVLTree0.height());
      assertNotSame(aVLTree_Node1, aVLTree_Node0);
      
      AVLTree.Node aVLTree_Node2 = aVLTree0.find((-1));
      assertNotNull(aVLTree_Node2);
      assertFalse(aVLTree_Node2.equals((Object)aVLTree_Node1));
      assertFalse(aVLTree_Node2.equals((Object)aVLTree_Node0));
      assertEquals(1, aVLTree0.height());
      assertNotSame(aVLTree_Node2, aVLTree_Node1);
      assertNotSame(aVLTree_Node2, aVLTree_Node0);
      
      aVLTree_Node2.height = 1040;
      assertEquals(1, aVLTree0.height());
      
      aVLTree_Node2.key = 1;
      assertEquals(1, aVLTree0.height());
      
      int int0 = aVLTree0.getBalance(aVLTree_Node1);
      assertFalse(aVLTree_Node1.equals((Object)aVLTree_Node2));
      assertFalse(aVLTree_Node1.equals((Object)aVLTree_Node0));
      assertEquals((-1041), int0);
      assertEquals(1, aVLTree0.height());
      assertNotSame(aVLTree_Node1, aVLTree_Node2);
      assertNotSame(aVLTree_Node1, aVLTree_Node0);
      
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
  public void test07()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert((-610));
      assertEquals(0, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      assertNotNull(aVLTree_Node0);
      assertEquals(0, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node1 = aVLTree0.find((-610));
      assertNotNull(aVLTree_Node1);
      assertEquals(0, aVLTree0.height());
      assertSame(aVLTree_Node1, aVLTree_Node0);
      
      aVLTree_Node0.right = aVLTree_Node1;
      assertEquals(0, aVLTree0.height());
      
      aVLTree_Node0.height = (-610);
      assertEquals((-610), aVLTree0.height());
      
      aVLTree0.delete((-610));
      assertEquals(0, aVLTree0.height());
      
      int int0 = aVLTree0.getBalance(aVLTree_Node0);
      assertEquals(1, int0);
      assertEquals(0, aVLTree0.height());
      assertSame(aVLTree_Node0, aVLTree_Node1);
      
      // Undeclared exception!
      aVLTree0.find((-1));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.delete(0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(0, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      assertNotNull(aVLTree_Node0);
      assertEquals(0, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node1 = aVLTree0.find(0);
      assertNotNull(aVLTree_Node1);
      assertEquals(0, aVLTree0.height());
      assertSame(aVLTree_Node1, aVLTree_Node0);
      
      aVLTree_Node1.right = aVLTree_Node0;
      assertEquals(0, aVLTree0.height());
      
      int int0 = aVLTree0.getBalance(aVLTree_Node1);
      assertEquals(1, int0);
      assertEquals(0, aVLTree0.height());
      assertSame(aVLTree_Node1, aVLTree_Node0);
      
      int int1 = 0;
      aVLTree_Node0.left = aVLTree_Node1.right;
      assertEquals(0, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node2 = aVLTree0.getRoot();
      assertNotNull(aVLTree_Node2);
      assertEquals(0, aVLTree0.height());
      assertSame(aVLTree_Node2, aVLTree_Node0);
      assertSame(aVLTree_Node2, aVLTree_Node1);
      
      aVLTree_Node0.height = 0;
      assertEquals(0, aVLTree0.height());
      
      aVLTree_Node2.left = aVLTree_Node0;
      assertEquals(0, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node3 = aVLTree_Node2.right;
      assertNotNull(aVLTree_Node3);
      assertSame(aVLTree_Node3, aVLTree_Node1);
      assertSame(aVLTree_Node3, aVLTree_Node2);
      assertSame(aVLTree_Node3, aVLTree_Node0);
      
      aVLTree_Node1.left = aVLTree_Node3;
      assertEquals(0, aVLTree0.height());
      
      // Undeclared exception!
      aVLTree0.delete(0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.delete(39);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.delete(115);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.delete((-15));
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert((-15));
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.delete(1);
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(1040);
      assertNotNull(aVLTree_Node0);
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      assertNotNull(aVLTree_Node1);
      assertFalse(aVLTree_Node1.equals((Object)aVLTree_Node0));
      assertEquals(1, aVLTree0.height());
      assertNotSame(aVLTree_Node1, aVLTree_Node0);
      
      AVLTree.Node aVLTree_Node2 = aVLTree0.find((-15));
      assertNotNull(aVLTree_Node2);
      assertFalse(aVLTree_Node2.equals((Object)aVLTree_Node1));
      assertFalse(aVLTree_Node2.equals((Object)aVLTree_Node0));
      assertEquals(1, aVLTree0.height());
      assertNotSame(aVLTree_Node2, aVLTree_Node1);
      assertNotSame(aVLTree_Node2, aVLTree_Node0);
      
      aVLTree_Node2.height = 1040;
      assertEquals(1, aVLTree0.height());
      
      aVLTree_Node2.key = 1;
      assertEquals(1, aVLTree0.height());
      
      int int0 = aVLTree0.getBalance(aVLTree_Node1);
      assertFalse(aVLTree_Node1.equals((Object)aVLTree_Node0));
      assertFalse(aVLTree_Node1.equals((Object)aVLTree_Node2));
      assertEquals((-1041), int0);
      assertEquals(1, aVLTree0.height());
      assertNotSame(aVLTree_Node1, aVLTree_Node0);
      assertNotSame(aVLTree_Node1, aVLTree_Node2);
      
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
  public void test10()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      assertNull(aVLTree_Node0);
      assertEquals((-1), aVLTree0.height());
      
      int int0 = aVLTree0.getBalance((AVLTree.Node) null);
      assertEquals(0, int0);
      assertEquals((-1), aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(0, aVLTree0.height());
      
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
  public void test12()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.delete(0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.delete((-2037));
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.delete(0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert(572);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert(2655);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.delete(0);
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      assertNotNull(aVLTree_Node0);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert(363);
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.insert((-762));
      assertEquals(2, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node1 = aVLTree0.find(908);
      assertNull(aVLTree_Node1);
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.insert(908);
      assertEquals(2, aVLTree0.height());
      
      int int0 = aVLTree0.height();
      assertEquals(2, int0);
      assertEquals(2, aVLTree0.height());
      
      int int1 = aVLTree0.height();
      assertTrue(int1 == int0);
      assertEquals(2, int1);
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.delete(363);
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.delete(572);
      assertEquals(2, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node2 = aVLTree0.find(0);
      assertNotNull(aVLTree_Node2);
      assertFalse(aVLTree_Node2.equals((Object)aVLTree_Node0));
      assertEquals(2, aVLTree0.height());
      assertNotSame(aVLTree_Node2, aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(0, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      assertNotNull(aVLTree_Node0);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert((-2286));
      assertEquals(1, aVLTree0.height());
      
      // Undeclared exception!
      try { 
        aVLTree0.delete(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.delete(0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.delete(0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert((-1606));
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert((-1588));
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      assertNotNull(aVLTree_Node0);
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert((-536));
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.delete(1);
      assertEquals(0, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert((-1758));
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(0);
      assertNotNull(aVLTree_Node0);
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert((-1321));
      assertEquals(0, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.find((-2126));
      assertNull(aVLTree_Node0);
      assertEquals(0, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(879);
      assertNull(aVLTree_Node0);
      assertEquals((-1), aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.delete(1753);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert((-1));
      assertEquals(0, aVLTree0.height());
      
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
  public void test20()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.delete(0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.delete((-2037));
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.delete(0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert(572);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert(2655);
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      assertNotNull(aVLTree_Node0);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert(363);
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.insert((-2037));
      assertEquals(2, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node1 = aVLTree0.find(908);
      assertNull(aVLTree_Node1);
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.insert(908);
      assertEquals(2, aVLTree0.height());
      
      int int0 = aVLTree0.height();
      assertEquals(2, int0);
      assertEquals(2, aVLTree0.height());
      
      int int1 = aVLTree0.height();
      assertTrue(int1 == int0);
      assertEquals(2, int1);
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.delete(363);
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.delete(572);
      assertEquals(2, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node2 = aVLTree0.find(0);
      assertNotNull(aVLTree_Node2);
      assertFalse(aVLTree_Node2.equals((Object)aVLTree_Node0));
      assertEquals(2, aVLTree0.height());
      assertNotSame(aVLTree_Node2, aVLTree_Node0);
      
      AVLTree.Node aVLTree_Node3 = aVLTree0.find(1);
      assertNull(aVLTree_Node3);
      assertEquals(2, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(61);
      aVLTree0.insert(0);
      aVLTree0.insert((-166));
      aVLTree0.delete((-166));
      aVLTree0.delete((-166));
      aVLTree0.getRoot();
      int int0 = aVLTree0.height();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(131);
      aVLTree0.insert((-596));
      aVLTree0.insert(0);
      aVLTree0.delete((-1));
      aVLTree0.insert(389);
      assertEquals(2, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete((-2030));
      aVLTree0.delete(1);
      int int0 = aVLTree0.height();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-1196));
      aVLTree0.insert(0);
      aVLTree0.delete((-1));
      aVLTree0.delete((-1));
      int int0 = 0;
      aVLTree0.insert(1306);
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
  public void test25()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(0);
      int int0 = aVLTree0.height();
      assertEquals((-1), int0);
  }
}
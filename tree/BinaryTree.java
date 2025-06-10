package tree;
class Node{
	int no;
	Node left,right;
	Node(int no){
		this.no=no;
		this.left=null;
		this.right=null;
	}
}
class MyTree{
	public Node insertNode(Node root , int key) {
		if(root == null) {
			Node p = new Node(key);
			return p;
		} else if(key > root.no){
			root.right = insertNode(root.right,key);
		} else {
			root.left = insertNode(root.left,key);
		}
		return root;
	}
	
	//traverse with inorder;
	public void inOrder(Node root) {
		if(root != null) {
			inOrder(root.left);
			System.out.print(root.no+"\t");
			inOrder(root.right);
		}
	}
//	public void searchNumber(Node root,int key) {
//		if(root==null) {
//			System.out.println("number not found");
//			if(root.left!=null&& root.right!=null) {
//				System.out.println("Node has two child");
//			} else if(root.left != null||root.right !=null) {
//				System.out.println("Node has one child");
//			}
//			else {
//				System.out.println("Node has no child");
//			}
//			return;
//			
//		} else if(root.no==key) {
//			System.out.println("Number found....");
//		} else if(key>root.no) {
//			searchNumber(root.right,key);
//		}else {
//			searchNumber(root.left,key);
//		}
//	}
	
	public void searchNumber(Node root,int key) {
		if(root ==null) {
			System.out.println("Number not found");
		     return;	
		}else if(root.no==key) {
			System.out.println("Number found..");
			if(root.left != null && root.right != null){
			    System.out.println("Node has two child");
			} else if(root.left != null || root.right != null){
			    System.out.println("Node has one child");
			} else {
			    System.out.println("Node has no child");
			}
			return;
		}else if(key>root.no) {
			searchNumber(root.right, key);
			
		}else {
			searchNumber(root.left,key);
		}
	}
	//Deleting the element
	public void deleteNumber(Node root,Node prevRoot,int key) {
		if(root == null) {
			System.out.println("No item found to delete");
		} else if(root.no == key) {
			if(root.left != null && root.right != null){
			    System.out.println("Node has two child");
			} else if(root.left != null || root.right != null){
			    System.out.println("Node has one child");
			} else {
			    if(key > prevRoot.no) {
			    	prevRoot.right =null;
			    } else {
			    	prevRoot.left = null;
			    }
			}
			
		} else if(key>root.no) {
			deleteNumber(root.right,root,key);
		} else {
			deleteNumber(root.left,root,key);
		}
		
	}
	
	public int findMax(Node root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		int result = root.no;
		int left = findMax(root.left);
		int right = findMax(root.right);
		if(left>result) {
			result = left;
		}
		if(right>result) {
			result = right;
		}
		return result;
	}
}
public class BinaryTree {

	public static void main(String[] args) {
		Node root = null;
		MyTree p = new MyTree();
		root = p.insertNode(root, 100);
		root = p.insertNode(root, 150);
		root = p.insertNode(root,170);
		root = p.insertNode(root, 180);
		root =p.insertNode(root, 120);
		root =p.insertNode(root, 165);
		root = p.insertNode(root, 50);
		p.inOrder(root);
		System.out.println();
//		p.searchNumber(root, 120);
//		p.searchNumber(root, 100);
		p.deleteNumber(root, null,125);
		System.out.println();
		p.inOrder(root);
	}

}

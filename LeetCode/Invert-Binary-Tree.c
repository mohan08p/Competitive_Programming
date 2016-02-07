/* Problem Statement:

Invert a binary tree.

     4
   /   \
  2     7
 / \   / \
1   3 6   9

to
     4
   /   \
  7     2
 / \   / \
9   6 3   1

*/

/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
struct TreeNode* invertTree(struct TreeNode* root) {
        
        
         if(root==NULL)
         return NULL;
         else if(root->left==NULL && root->right==NULL)
         return root;
         else
         {
         struct TreeNode* temp = root->left;
         root->left=invertTree(root->right);
         root->right=invertTree(temp);
         }
         
    
}
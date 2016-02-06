/* Problem Statement:

Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

1)The left subtree of a node contains only nodes with keys less than the node's key.
2)The right subtree of a node contains only nodes with keys greater than the node's key.
3)Both the left and right subtrees must also be binary search trees.

*/

/* Hint: The important point to realize in this problem is that
if we store the inorder traversal of the binary search tree 
it should be sorted in ascending order */

/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    bool isValidBST(TreeNode* root) {
        vector<int> path;
        
        if(!root) return true;
        if(!root->left && !root->right) return true;
        
        inorder(root,path);
        printf("%d", path.size());
        for(int i=0;i<path.size()-1;i++)
        {
            if(path[i+1]<=path[i])
                return false;
        }
        
        return true;
    }
    
    void inorder(TreeNode* root, vector<int>& path)
    {
        if(root)
        {
            inorder(root->left,path);
            path.push_back(root->val);
            inorder(root->right,path);
        }
    }
};
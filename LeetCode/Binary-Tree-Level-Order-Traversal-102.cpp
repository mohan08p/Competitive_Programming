/* Problem Statement:

Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:

Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7

return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]

*/


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
    vector<vector<int>> levelOrder(TreeNode* root) {
    vector<vector<int>> levelvec;
    vector<int> level;
    
    queue<TreeNode*> q;
    
    if(root==NULL) return levelvec;
    
    TreeNode* temp=root;
    q.push(temp);
    
    int  l = 1;          // Loop Variable to keep track of "CountOfNodes"
    int CountOfNodes=0;  // Number of nodes in a given level
    
    while(!q.empty())
    {
        
        for(int i=0;i<l;i++)        // loop to get number of nodes in a current level and enqueue them in the queue
        {
            temp=q.front();
            level.push_back(temp->val);
            printf("%d ",temp->val);
          
            if(temp->left)
            {
                CountOfNodes++;
                q.push(temp->left);
                
            }
            if(temp->right)
            {
                CountOfNodes++;
                q.push(temp->right);
            }
            q.pop();            // remove the explored node
           
        }
        
        l=CountOfNodes;         // Use value of "CountOfNodes" as loop variable in next iteration  
        CountOfNodes=0;         // Reset "CountOfNodes" for next iteration
        levelvec.push_back(level);
        level.clear();
    }
    
    return levelvec;
    }
    
};
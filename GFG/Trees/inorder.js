let inorder = (root,ar=[])=>{
    if(root){
        inorder(root.left,ar)
        ar.push(root.val)
        inorder(root.right,ar)
    }
    return arr
}
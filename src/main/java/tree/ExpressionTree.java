package tree; /**
 * Java Program to Implement Expression Tree Algorithm
 */
/** Class ExpressionTree **/
class ExpressionTree
{
    /** constructor **/
    public ExpressionTree()
    {
        top = null;
    }
    /** class TreeNode **/
    class TreeNode
    {
        char data;
        TreeNode left, right;

        /** constructor **/
        public TreeNode(char data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    /** class StackNode **/
    class StackNode
    {
        TreeNode treeNode;
        StackNode next;

        /** constructor **/
        public StackNode(TreeNode treeNode)
        {
            this.treeNode = treeNode;
            next = null;
        }
    }

    private static StackNode top;

    /** Metodo para ingresar un nodo*/
    private void push(TreeNode ptr)
    {
        if (top == null)
            top = new StackNode(ptr);
        else
        {
            StackNode nptr = new StackNode(ptr);
            nptr.next = top;
            top = nptr;
        }
    }

    /** Metodo para sacar un nodo**/
    private TreeNode pop()
    {
        if (top == null)
            throw new RuntimeException("Underflow");
        else
        {
            TreeNode ptr = top.treeNode;
            top = top.next;
            return ptr;
        }
    }

    /** Metodo para obtener el nodo top del arbol**/
    private TreeNode peek()
    {
        return top.treeNode;
    }

    /** Insertar elementos al arbol **/
    private void insert(char val)
    {
        try
        {
            if (isDigit(val))
            {
                TreeNode nptr = new TreeNode(val);
                push(nptr);
            }
            else if (isOperator(val))
            {
                TreeNode nptr = new TreeNode(val);
                nptr.left = pop();
                nptr.right = pop();
                push(nptr);
            }
        }
        catch (Exception e)
        {
            ;
        }
    }

    /** Revisar si se tiene numero **/
    private boolean isDigit(char ch)
    {
        return ch >= '0' && ch <= '9';
    }

    /** Revisar si se tiene operador **/
    private boolean isOperator(char ch)
    {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    /** Pasar string a int**/
    private int toDigit(char ch)
    {
        return ch - '0';
    }

    /** Crear arbol usando la notacion pre fix*/
    public void buildTree(String eqn)
    {
        for (int i = eqn.length() - 1; i >= 0; i--)
            insert(eqn.charAt(i));
    }

    /** Obtener el nodo del top*/
    public double evaluate()
    {
        return evaluate(peek());
    }

    /** Evaluar el arbol */
    public double evaluate(TreeNode ptr)
    {
        if (ptr.left == null && ptr.right == null)
            return toDigit(ptr.data);
        else
        {
            double result = 0.0;
            double left = evaluate(ptr.left);
            double right = evaluate(ptr.right);
            char operator = ptr.data;

            switch (operator)
            {
                case '+' : result = left + right; break;
                case '-' : result = left - right; break;
                case '*' : result = left * right; break;
                case '/' : result = left / right; break;
                default  : result = left + right; break;
            }
            return result;
        }
    }

    /** Metodo para obtener forma postfix*/
    public void postfix()
    {
        postOrder(peek());
    }

    /** post orden transversal */
    private void postOrder(TreeNode ptr)
    {
        if (ptr != null)
        {
            postOrder(ptr.left);
            postOrder(ptr.right);
            System.out.print(ptr.data);
        }
    }

    /** Metodo para obtener forma infix */
    public void infix()
    {
        inOrder(peek());
    }

    /** in orden transversal */
    private void inOrder(TreeNode ptr)
    {
        if (ptr != null)
        {
            inOrder(ptr.left);
            System.out.print(ptr.data);
            inOrder(ptr.right);
        }
    }

    /** Metodo para obtener forma prefix*/
    public void prefix()
    {
        preOrder(peek());
    }

    /** pre orden transversal */
    private void preOrder(TreeNode ptr)
    {
        if (ptr != null)
        {
            System.out.print(ptr.data);
            preOrder(ptr.left);
            preOrder(ptr.right);
        }
    }
}



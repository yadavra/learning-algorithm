package com.awanish.datastructure.tree;

public interface Node<E>{
      public Node<E> getRightChild();
      public Node<E> getLeftChild();
      
      public void setRightChild(Node<E> node);
      public void setLeftChild(Node<E> node);
      
      
      public E getElement();
      public void setElement(E element);
      
      public boolean isNodePartOfTree() ;
      public void setIsNodePartOfTree(boolean isNodePartOfTree);
      
      
  
}

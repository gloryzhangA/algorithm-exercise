package com.zy.algorithm.leetcode;

import dataStructure.ListNode;

public class a002addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultListNode = new ListNode(0);
        ListNode result = resultListNode;
        int carryBit = 0;
        while(l1 != null && l2 != null){
            resultListNode.next = new ListNode((l1.val + l2.val + carryBit)%10);
            if(l1.val + l2.val + carryBit>=10){
                carryBit = 1;
            }else{
                carryBit = 0;
            }
            l1 = l1.next;
            l2 = l2.next;
            resultListNode = resultListNode.next;
        }
        if(l1==null && l2==null && carryBit ==1){
            resultListNode.next = new ListNode(1);
            resultListNode = resultListNode.next;
        }
        if(l1 != null){
            while(l1 != null){
                resultListNode.next = new ListNode((l1.val + carryBit)%10);
                if(l1.val + carryBit>=10){
                    carryBit = 1;
                }else{
                    carryBit = 0;
                }
                l1 = l1.next;
                resultListNode = resultListNode.next;
            }
        }
        if(l2 != null){
            while(l2 != null){
                resultListNode.next = new ListNode((l2.val + carryBit)%10);
                if(l2.val + carryBit>=10){
                    carryBit = 1;
                }else{
                    carryBit = 0;
                }
                l2 = l2.next;
                resultListNode = resultListNode.next;
            }
        }
        return result.next;
    }
}

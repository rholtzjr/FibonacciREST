/**
 * @author rholtz
 * @description This application will take an input N from the user and construct a 
 *              string representation of the Fibonacci Sequence that to the Nth
 *              sequence number.
 */

package org.holtz.fibonacci;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.holtz.fibonacci.bean.FibonacciBean;

public class Fibonacci {

    public List<String> fib(int n) {

        int prev1 = 0, prev2 = 1;
        List<String> buf = new ArrayList<String>();

        for (int i = 0; i < n; i++) {
            buf.add(Integer.toString(prev1));
            //buf.add(i, new FibonacciBean(Integer.toString(prev1)));
            int savePrev1 = prev1;
            prev1 = prev2;
            prev2 = savePrev1 + prev2;
        }
        return buf;
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public List getSequence(int count) {
        List retList = new ArrayList();
        if (count > 0) {
            if (count < 48) {
                retList.addAll((List) fib(count));
            } else {
                retList.add("Integer overrun has occured!");
            }
        } else {
            retList.add("Must be a positive number!");
        }

        return retList;
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public List getBigSequence(long count) {
        List retList = new ArrayList();

        if (count > 0) {
            retList.addAll((List) bigFib(count));
        } else {
            retList.add("Must be a positive number!");
        }
        return retList;
    }

    public List<String> bigFib(long n1) {

        BigInteger prev1 = new BigInteger("0");
        BigInteger prev2 = new BigInteger("1");
        List<String> buf = new ArrayList<String>();
        for (long i = 0; i < n1; i++) {
            buf.add(prev1.toString());
            BigInteger savePrev1 = prev1;
            prev1 = prev2;
            prev2 = savePrev1.add(prev2);
        }
        return buf;
    }
}


package com.sjy.springcloud.service.impl;

import com.sjy.springcloud.dao.PaymentDao;
import com.sjy.springcloud.service.PaymentService;
import entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xstre
 * Date: 2021/12/25
 * Time: 14:56
 * Description: No Description
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public Payment queryById(Long id) {
        return paymentDao.queryById(id);
    }

    @Override
    public List<Payment> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    public int insert(Payment payment) {
        return paymentDao.insert(payment);
    }

    @Override
    public Payment update(Payment payment) {
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }
}

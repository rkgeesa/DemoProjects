package com.cache.demo.service.impl;

import com.cache.demo.beans.Customer;
import com.cache.demo.service.SystemAPIService;
import org.springframework.stereotype.Service;


@Service
public class SystemAPIServiceImpl implements SystemAPIService {


    @Override
    public Customer fetchData() {

        synchronized (this) {

            return new Customer(1000, "Ramakrishna", "India");
            // TODO inserted by rage0717 [Mar 16, 2020, 3:13:05 PM]
        }

    }

}

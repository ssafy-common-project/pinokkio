import axios from './Axios';

export const getOrdersByRange = async (startDate, endDate) => {
  try {
    const response = await axios.get(`/api/orders/duration`, {
      params: {
        startDate: startDate,
        endDate: endDate,
      },
    });
    return response.data;
  } catch (error) {
    console.error('get order list by range error', error);
    throw error;
  }
};

export const makeOrder = async (customerId, orderList) => {
  console.log('dedeeddddddddddddddddddddddd');
  console.log(customerId);
  console.log(orderList);
  try {
    const response = await axios.post(`/api/orders`, {
      customerId: customerId,
      orderItems: orderList,
    });
    return response.data;
  } catch (error) {
    console.error('make order error', error);
    throw error;
  }
};

export const putOrderStatus = async (orderId) => {
  try {
    const response = await axios.put(`/api/orders/${orderId}/status`);
    return response.data;
  } catch (error) {
    console.error('change order status error', error);
    throw error;
  }
};

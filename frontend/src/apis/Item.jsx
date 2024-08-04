import axios from './Axios'; // 인스턴스와 구분하기 위해 대문자 사용

/*
변수 네이밍 규칙
0. camelCase를 사용한다.
1. 행위를 맨 앞에 쓴다.
2. 가져오는 item을 다음에 쓴다.
3. 가져오는 item이 리스트라면 복수형(items)으로 쓴다.
4. 다른 변수(parameter)를 이용해서 행위를 한다면 By를 사용하여 네이밍한다.
4-1. 다만 pos는 필수이므로 By에 적지 않는다.
5. 다른 변수가 여러 개라면 그냥 붙여서 쓴다.
*/

export const deleteItem = (posId, itemId) => {
  axios
    .delete('/api/pos/:posId/items/:itemId', { params: { posId: posId, itemId: itemId } })
    .then((response) => {
      // response

      return response;
    })
    .catch((error) => {
      // 오류발생시 실행
    })
    .then(() => {
      // 항상 실행
    });
};

export const getItemByItemId = (posId, itemId) => {
  axios
    .get('/api/pos/:posId/items/:itemId', { params: { posId: posId, itemId: itemId } })
    .then((response) => {
      // response

      return response;
    })
    .catch((error) => {
      // 오류발생시 실행
    })
    .then(() => {
      // 항상 실행
    });
};

export const getItems = (posId) => {
  axios
    .post('/api/pos/:posId/categories', { params: { posId: posId } })
    .then((response) => {
      // response

      return response;
    })
    .catch((error) => {
      // 오류발생시 실행
    })
    .then(() => {
      // 항상 실행
    });
};

export const getItemsByKeyword = (posId, keyword) => {
  axios
    .get('/api/pos/:posId/items/search', {
      params: {
        posId: posId,
        searchItemRequest: {
          keyword: keyword,
        },
      },
    })
    .then((response) => {
      // response

      return response;
    })
    .catch((error) => {
      // 오류발생시 실행
    })
    .then(() => {
      // 항상 실행
    });
};

export const getItemsByCategoryId = async (posId, categoryId) => {
  // console.log('axios');
  // console.log(axios.defaults.headers.common['Authorization']);
  // console.log(posId);
  // console.log(categoryId);
  try {
    const response = await axios.get(`/api/pos/${posId}/items/categories/${categoryId}`);
    return response.data;
  } catch (error) {
    console.error('get menus by category failed:', error);
    throw error;
  }
};

export const postItem = (itemData) => {
  axios
    .post('/api/pos/items', {
      itemData,
    })
    .then((response) => {
      // response

      return response;
    })
    .catch((error) => {
      // 오류발생시 실행
    })
    .then(() => {
      // 항상 실행
    });
};

export const putItem = (itemId, posId, itemData) => {
  axios
    .post('/api/pos/:posId/items/:itemId', {
      params: {
        itemId: itemId,
        posId: posId,
      },
      itemData,
    })
    .then((response) => {
      // response

      return response;
    })
    .catch((error) => {
      // 오류발생시 실행
    })
    .then(() => {
      // 항상 실행
    });
};

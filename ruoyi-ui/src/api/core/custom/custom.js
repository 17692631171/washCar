import request from '@/utils/request'

// 查询顾客信息
export function getCustomList(query) {
  return request({
    url: '/custom/getCustomList',
    method: 'get',
    params: query
  })
}

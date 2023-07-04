import request from '@/utils/request'

// 查询顾客信息
export function getCustomList(queryParams) {
  return request({
    url: '/core/custom/list',
    method: 'get',
    params: queryParams
  })
}

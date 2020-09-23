var subdomainVisits = function(cpdomains) {
    var domains = new Map()
    let current
    let count
    let curDomains
    let curDomain = ''
    let period = false
    for(var i = 0; i<cpdomains.length; i++){
        current = cpdomains[i]
        count = current.split(' ')[0]
        curDomains = current.split(' ')[1].split('.')
        curDomain = ''
        period = false
        for(var x = curDomains.length-1 ; x >= 0; x--){
            if(period){
                curDomain = curDomains[x] + '.' + curDomain
            } else {
                period = true
                curDomain = curDomains[x] + curDomain
            }
            if(domains.has(curDomain)){
                domains.set(curDomain,domains.get(curDomain) + parseInt(count))
            } else {
                domains.set(curDomain,parseInt(count))
            }
        }
    }
    
    let result = []
    let aux
    domains.forEach((val,key)=> {
        result.push(val + ' ' + key)
    })
    return result
};
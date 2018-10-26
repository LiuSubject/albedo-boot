package com.albedo.java.web.rest.base;

import com.albedo.java.common.persistence.service.TreeVoService;
import com.albedo.java.util.PublicUtil;
import com.albedo.java.util.domain.Globals;
import com.albedo.java.vo.base.TreeEntityVo;
import com.codahale.metrics.annotation.Timed;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 基础控制器支持类 copyright 2014 albedo all right reserved author MrLi created on 2014年10月15日 下午4:04:00
 */
public class TreeVoResource<Service extends TreeVoService, V extends TreeEntityVo>
        extends BaseResource {

    protected final Service service;

    public TreeVoResource(Service service){
        this.service = service;
    }

    @ModelAttribute
    public V getAttribute(@RequestParam(required = false) String id, HttpServletRequest request) throws Exception {
        String path = request.getRequestURI();
        if (path != null && !path.contains(Globals.URL_CHECKBY) && !path.contains(Globals.URL_FIND) &&
                PublicUtil.isNotEmpty(id)) {
            return (V) service.findOneVo(id);
        } else {
            return (V) service.getEntityVoClz().newInstance();
        }
    }
    /**
     * @param id
     * @return
     */
    @GetMapping("/{id:" + Globals.LOGIN_REGEX + "}")
    @ResponseBody
    @Timed
    public V info(@PathVariable String id) {
        log.debug("REST request to get Entity : {}", id);
        return (V) service.findOneVo(id);
    }

    @ResponseBody
    @GetMapping(value = "checkByProperty")
    public boolean checkByProperty(V entityForm) {
        return service.doCheckByProperty(entityForm);
    }

    @ResponseBody
    @GetMapping(value = "checkByPK")
    public boolean checkByPK(V entityForm) {
        return service.doCheckByPK(entityForm);
    }

}

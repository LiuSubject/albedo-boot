import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import {HttpUtilsService} from "./http-utils.service";
import {CTX} from "../../app.constants";
import { map} from 'rxjs/operators';


@Injectable()
export class DataSystemService {

    constructor(private http: HttpClient,
				private httpUtils: HttpUtilsService) { }


    dictCodes(req?: any): Observable<any> {
        return this.http.get(CTX + '/dataSystem/dict/codes', req)
    }

    menus(): Observable<any> {
        return this.moduleData({ type: 'menu' })
    }

    moduleData(params?: any): Observable<any> {
        return this.http.get(CTX + '/dataSystem/module/data', params).pipe(
			map((res: any) => {
				if (res && res.data) {
					return res.data.moduleList
				}
				return null;
			}),
		);
    }

    moduleTreeData(): Observable<any> {
        return this.http.get(CTX + '/dataSystem/module/findTreeData')
			.pipe(map((res: any) => res && res.data))
    }
    dictTreeData(): Observable<any> {
        return this.http.get(CTX + '/dataSystem/dict/findTreeData')
			.pipe(map((res: any) => res && res.data))
    }
    orgTreeData(): Observable<any> {
        return this.http.get(CTX + '/dataSystem/org/findTreeData')
			.pipe(map((res: any) => res && res.data))
    }

}

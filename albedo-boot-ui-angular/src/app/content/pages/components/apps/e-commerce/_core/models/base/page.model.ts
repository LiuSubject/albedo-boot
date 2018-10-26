import { General } from "./general.model"

export class PageModel<T extends General>{

    public total?: number
    public perpage: number
    public offset?: number
    public page?: number
    public data?: T[];


}

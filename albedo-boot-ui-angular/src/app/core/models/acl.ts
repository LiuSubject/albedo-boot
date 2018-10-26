import { ConfigModel } from '../interfaces/config';

export interface AclInterface {
	// permissions: any;
	currentUserAuthorities: any;
}

export class AclModel implements AclInterface, ConfigModel {
	public config: any;

	// default permissions
	// public permissions: any = {
	// 	ADMIN: ['canDoAnything'],
	// 	USER: ['canDoLimitedThings']
	// };

	// store an object of current user authorities
	public currentUserAuthorities: any = [];

	constructor() {}
}
